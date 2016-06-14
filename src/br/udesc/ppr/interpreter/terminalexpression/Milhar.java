/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ppr.interpreter.terminalexpression;

import br.udesc.ppr.interpreter.abstractexpression.Interpreter;
import br.udesc.ppr.interpreter.context.Context;

/**
 *
 * @author ignoi
 */
public class Milhar extends Interpreter {

    @Override
    public boolean filtrar(Context contexto) {
        if (contexto.getLenght() > 3) {
            String input = Integer.toString(contexto.getInput());
            contexto.setData(Integer.parseInt(input.substring(input.length() - 3, input.length())));
            contexto.setInput((contexto.getInput() - contexto.getData()) / 1000);
            return true;
        }
        return false;
    }

    @Override
    public void classe(Context contexto) {
        if (contexto.getOutput().trim().equals("um")) {
            contexto.setOutput("mil ");
        } else {
            contexto.setOutput(contexto.getOutput() + "mil ");
        }
        contexto.setInput(contexto.getData());
    }
}
