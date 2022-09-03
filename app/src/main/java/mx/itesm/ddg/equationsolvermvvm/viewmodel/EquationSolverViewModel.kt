package mx.itesm.ddg.equationsolvermvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import mx.itesm.ddg.equationsolvermvvm.model.QuadraticEquationSolution
import mx.itesm.ddg.equationsolvermvvm.model.QuadraticEquationSolver

/**
 * Author: David Damian
 * The ViewModel for the EquationSolverView.
 */

class EquationSolverViewModel {
    val root1: MutableLiveData<String> = MutableLiveData<String>()
    val root2: MutableLiveData<String> = MutableLiveData<String>()

    /**
     * Calls the QuadraticEquationSolver model to solve a quadratic equation given the parameters
     * and sets the results in the MutableLiveData values.
     * @param a the parameter a in the quadratic solution formula
     * @param b the parameter b in the quadratic solution formula
     * @param c the parameter c in the quadratic solution formula
     */
    fun solve(a: Double, b: Double, c: Double) {
        val solution: QuadraticEquationSolution = QuadraticEquationSolver.solve(a, b, c)

        if (solution.solution1 != null) {
            root1.value = solution.solution1.toString()
        }
        else {
            root1.value = "Ecuación no valida"
        }

        if (solution.solution2 != null) {
            root2.value = solution.solution2.toString()
        }
        else {
            root2.value = "Ecuación no valida"
        }
    }
}