/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ppr.interpreter.context;

/**
 *
 * @author ignoi
 */
public class Context {

    protected int input;

    protected int data;

    protected String output;

    protected int lenght;

    public Context(int input) {
        this.input = input;
        lenght = Integer.toString(input).length();
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getLenght() {
        return lenght;
    }

}
