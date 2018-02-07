package sml.instructions

import sml.Instruction
import sml.Machine

class DivInstruction(label: String, private val result: Int, private val op1: Int, private val op2: Int)
    : Instruction(label, "div") {




    override fun execute(m: Machine) {
        val value1 = m.registers.getRegister(op1)
        val value2 = m.registers.getRegister(op2)
        m.registers.setRegister(result, value1 / value2)
    }

    override  fun toString(): String {
        return super.toString() + " $op1 / $op2 and store the result to register $result"
    }

}