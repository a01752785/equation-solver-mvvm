package mx.itesm.ddg.equationsolvermvvm.view

import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import mx.itesm.ddg.equationsolvermvvm.R
import mx.itesm.ddg.equationsolvermvvm.databinding.ActivityMainBinding
import mx.itesm.ddg.equationsolvermvvm.viewmodel.EquationSolverViewModel

class EquationSolverView : AppCompatActivity() {
    private val viewModel: EquationSolverViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setObservables()
        registerEvents()
    }

    private fun registerEvents() {
        binding.btnSolveEquation.setOnClickListener {
            val a: Double = binding.etParameterA.text.toString().toDouble()
            val b: Double = binding.etParameterB.text.toString().toDouble()
            val c: Double = binding.etParameterC.text.toString().toDouble()
            viewModel.solve(a, b, c)
        }
    }

    private fun setObservables() {
        viewModel.root1.observe(this) { root ->
            binding.etRoot1.setText(root)
        }
        viewModel.root2.observe(this) { root ->
            binding.etRoot2.setText(root)
        }
    }
}