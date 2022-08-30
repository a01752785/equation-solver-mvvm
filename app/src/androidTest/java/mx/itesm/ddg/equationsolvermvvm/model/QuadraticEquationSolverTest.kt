package mx.itesm.ddg.equationsolvermvvm

import androidx.test.ext.junit.runners.AndroidJUnit4
import mx.itesm.ddg.equationsolvermvvm.model.Complex
import mx.itesm.ddg.equationsolvermvvm.model.QuadraticEquationSolution
import mx.itesm.ddg.equationsolvermvvm.model.QuadraticEquationSolver

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Author: David Damian
 * Tests for the QuadraticEquationSolverTest
 */

@RunWith(AndroidJUnit4::class)
class QuadraticEquationSolverTest {
    @Test
    fun testNoSolution() {
        assertEquals(QuadraticEquationSolution(null, null),
                     QuadraticEquationSolver.solve(0.0, 1.0, 2.0))
    }

    @Test
    fun testOneRealSolution() {
        assertEquals(QuadraticEquationSolution(Complex(-1.0, 0.0), Complex(-1.0, 0.0)),
                     QuadraticEquationSolver.solve(1.0, 2.0, 1.0))
    }

    @Test
    fun testTwoRealSolutions() {
        assertEquals(QuadraticEquationSolution(Complex(0.0, 0.0), Complex(-5.0, 0.0)),
                     QuadraticEquationSolver.solve(1.0, 5.0, 0.0))
    }

    @Test
    fun testTwoComplexSolutions() {
        assertEquals(QuadraticEquationSolution(Complex(-0.5, 0.8660254037844386),
                                               Complex(-0.5, -0.8660254037844386)),
                     QuadraticEquationSolver.solve(1.0, 1.0, 1.0))
    }
}