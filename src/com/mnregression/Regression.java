package com.mnregression;

import java.io.File;
import java.io.IOException;

import de.bwaldvogel.liblinear.Feature;
import de.bwaldvogel.liblinear.FeatureNode;
import de.bwaldvogel.liblinear.Linear;
import de.bwaldvogel.liblinear.Model;
import de.bwaldvogel.liblinear.Parameter;
import de.bwaldvogel.liblinear.Problem;
import de.bwaldvogel.liblinear.SolverType;

public class Regression {

    static int NUM_OF_TS_EXAMPLES = 8;

    // 1 = square, -1 = non-square
    static double[] GROUPS_ARRAY = {1, 1, 1, 1, -1, -1, -1, -1};

    // squares
    static FeatureNode[] shape1 = {new FeatureNode(1, 2), new FeatureNode(2, 2)};
    static FeatureNode[] shape2 = {new FeatureNode(1, 4), new FeatureNode(2, 4)};
    static FeatureNode[] shape3 = {new FeatureNode(1, 9), new FeatureNode(2, 9)};
    static FeatureNode[] shape4 = {new FeatureNode(1, 10), new FeatureNode(2, 10)};

    // not squares
    static FeatureNode[] shape5 = {new FeatureNode(1, 5), new FeatureNode(2, 6)};
    static FeatureNode[] shape6 = {new FeatureNode(1, 3), new FeatureNode(2, 4)};
    static FeatureNode[] shape7 = {new FeatureNode(1, 6), new FeatureNode(2, 9)};
    static FeatureNode[] shape8 = {new FeatureNode(1, 4), new FeatureNode(2, 2)};

    // unknown squares
    static FeatureNode[] unkown1 = {new FeatureNode(1, 32), new FeatureNode(2, 32)};
    static FeatureNode[] unkown2 = {new FeatureNode(1, 4), new FeatureNode(2, 2)};
    static FeatureNode[] unkown3 = {new FeatureNode(1, 4), new FeatureNode(2, 2)};
    static FeatureNode[][] trainingSetWithUnknown = {
        shape1,
        shape2,
        shape3,
        shape4,
        shape5,
        shape6,
        shape7,
        shape8
    };
    public static void main(String[] args) throws IOException {

        Problem problem = new Problem();

        // number of training examples
        problem.l = NUM_OF_TS_EXAMPLES;

        // number of features
        problem.n = NUM_OF_TS_EXAMPLES + 1;

        // problem.x = ... // feature nodes
        problem.x = trainingSetWithUnknown;

        // problem.y = ... // target values
        problem.y = GROUPS_ARRAY;

        SolverType solver = SolverType.L2R_LR; // -s 0
        double C = 1.0; // cost of constraints violation
        double eps = 0.01; // stopping criteria

        Parameter parameter = new Parameter(solver, C, eps);
        Model model = Linear.train(problem, parameter);
        File modelFile = new File("model");
        model.save(modelFile);
        // load model or use it directly
        model = Model.load(modelFile);

        Feature[] instance = new FeatureNode[5];
        double prediction = Linear.predict(model, instance);
    }
}