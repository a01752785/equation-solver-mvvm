package mx.itesm.ddg.equationsolvermvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mx.itesm.ddg.equationsolvermvvm.model.QuadraticEquationSolution
import mx.itesm.ddg.equationsolvermvvm.model.QuadraticEquationSolver

/**
 * Author: David Damian
 * The ViewModel for the EquationSolverView.
 */

class EquationSolverViewModel: ViewModel() {
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
        root1.value = QuadraticEquationSolver.parseSolution(solution.solution1)
        root2.value = QuadraticEquationSolver.parseSolution(solution.solution2)
    }
}