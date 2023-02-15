package moa.classifiers.lazy;

import junit.framework.Test;
import junit.framework.TestSuite;
import moa.classifiers.Classifier;
import moa.classifiers.AbstractMultipleClassifierTestCase;

public class kNNTestCase extends AbstractMultipleClassifierTestCase {
    public kNNTestCase(String name) {
        super(name);
        this.setNumberTests(1);
    }
    @Override
    protected Classifier[] getRegressionClassifierSetups() {
        return new Classifier[]{
                new kNN(),
        };
    }
    public static Test suite() {
        return new TestSuite(kNNTestCase.class);
    }
    public static void main(String[] args) {
        runTest(suite());
    }
}