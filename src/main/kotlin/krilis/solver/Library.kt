/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package krilis.solver

class Library {
    fun someLibraryMethod(): Boolean {
        val program = ProgramSpec()
        val x = ContinuousVar("x")
        val y = ContinuousVar("y")
        program.eqConstraint(x + x, y + y)
        return true
    }
}
