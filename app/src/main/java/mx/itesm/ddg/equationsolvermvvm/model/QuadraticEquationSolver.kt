package mx.itesm.ddg.equationsolvermvvm.model

import kotlin.math.absoluteValue
import kotlin.math.sqrt

/**
 * Author: David Damian
 * The QuadraticEquationSolver takes the parameters of a quadratic equation and returns a
 * QuadraticEquationSolution object holding the solution or no solution.
 */

class QuadraticEquationSolver {
    companion object {
        /**
         * Computes the solutions for a quadratic equation using the quadratic equation formula.
         * @param a the parameter a in the quadratic solution formula
         * @param b the parameter b in the quadratic solution formula
         * @param c the parameter c in the quadratic solution formula
         * @return a QuadraticEquationSolution representing the solution of the equation
         */
        fun solve(a: Double, b: Double, c: Double): QuadraticEquationSolution {
            val discriminant: Double = b * b - 4 * a * c

            return if (a == 0.0) {
                QuadraticEquationSolution(null, null)
            } else if (discriminant >= 0) {
                QuadraticEquationSolution(
                    Complex((-b + sqrt(discriminant)) / (2 * a), 0.0),
                    Complex((-b - sqrt(discriminant)) / (2 * a), 0.0))
            } else {
                QuadraticEquationSolution(
                    Complex(-(b / (2 * a)), (sqrt(discriminant.absoluteValue) / (2 * a))),
                    Complex(-(b / (2 * a)), -(sqrt(discriminant.absoluteValue) / (2 * a))))
            }
        }
    }
}