package moa.classifiers.lazy;

import junit.framework.Test;
import junit.framework.TestSuite;
import moa.classifiers.Classifier;
import moa.classifiers.AbstractMultipleClassifierTestCase;

public class kNNTest extends AbstractMultipleClassifierTestCase {
    public kNNTest(String name) {
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
        return new TestSuite(kNNTest.class);
    }
    public static void main(String[] args) {
        runTest(suite());
    }
}