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
public class Centena extends Interpreter {

    @Override
    public boolean filtrar(Context contexto) {
        return true;
    }

    @Override
    public void classe(Context contexto) {

    }

}
