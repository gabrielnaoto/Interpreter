/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ppr.interpreter;

import br.udesc.ppr.interpreter.abstractexpression.Interpreter;
import br.udesc.ppr.interpreter.context.Context;
import br.udesc.ppr.interpreter.terminalexpression.Bilhao;
import br.udesc.ppr.interpreter.terminalexpression.Centena;
import br.udesc.ppr.interpreter.terminalexpression.Milhao;
import br.udesc.ppr.interpreter.terminalexpression.Milhar;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ignoi
 */
public class Client {

    public static void main(String[] args) {
        try {
            List<Interpreter> interpretadores = new ArrayList<>();
            interpretadores.add(new Bilhao());
            interpretadores.add(new Milhao());
            interpretadores.add(new Milhar());
            interpretadores.add(new Centena());
            Context c = null;
            Scanner s = new Scanner(System.in);
            System.out.println("Informe um valor (int) maior do que 0:");
            int entrada = s.nextInt();
            c = new Context(entrada);
            for (Interpreter interpretadore : interpretadores) {
                interpretadore.interpretar(c);
            }
            System.out.println(entrada + " = " + c.getOutput());
        } catch (InputMismatchException i) {
            System.out.println("O valor máximo que uma variável int pode receber é " + Integer.MAX_VALUE + ", não abuse.");
        } catch (NullPointerException n){
            System.out.println("Este programa está configurado apenas para converter valores maiores do que 0.");
        }
    }

}
