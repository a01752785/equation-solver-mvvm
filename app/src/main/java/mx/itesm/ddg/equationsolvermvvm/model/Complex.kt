package mx.itesm.ddg.equationsolvermvvm.model

import kotlin.math.absoluteValue

/**
 * Author: David Damian
 * Complex represents a complex number.
 */

data class Complex(val real: Double, val imaginary: Double) {
    /**
     * Parses the complex number into a string.
     * @return a String of the complex number.
     */
    override fun toString(): String {
        return if (imaginary > 0) {
            "$real + ${imaginary}i"
        } else if (imaginary < 0) {
            "$real - ${imaginary.absoluteValue}i"
        } else {
            "$real"
        }
    }
}