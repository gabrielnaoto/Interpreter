/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ppr.interpreter.abstractexpression;

import br.udesc.ppr.interpreter.context.Context;

/**
 *
 * @author ignoi
 */
public abstract class Interpreter {

    public void interpretar(Context contexto) {
        if (filtrar(contexto)) {
            if (contexto.getInput() >= 100) {
                centena(contexto);
            }
            if (contexto.getInput() >= 10) {
                dezena(contexto);
            }
            if (contexto.getInput() >= 1) {
                unidade(contexto);
            }
            contexto.setOutput(contexto.getOutput().replace("null", ""));
            classe(contexto);
        }
    }

    public void centena(Context contexto) {
        int data = 0;
        if (contexto.getInput() >= 900) {
            contexto.setOutput(contexto.getOutput() + "novecentos ");
            data = 900;
        } else {
            if (contexto.getInput() >= 800) {
                contexto.setOutput(contexto.getOutput() + "oitocentos ");
                data = 800;
            } else {
                if (contexto.getInput() >= 700) {
                    contexto.setOutput(contexto.getOutput() + "setecentos ");
                    data = 700;
                } else {
                    if (contexto.getInput() >= 600) {
                        contexto.setOutput(contexto.getOutput() + "seiscentos ");
                        data = 600;
                    } else {
                        if (contexto.getInput() >= 500) {
                            contexto.setOutput(contexto.getOutput() + "quinhentos ");
                            data = 500;
                        } else {
                            if (contexto.getInput() >= 400) {
                                contexto.setOutput(contexto.getOutput() + "quatrocentos ");
                                data = 400;
                            } else {
                                if (contexto.getInput() >= 300) {
                                    contexto.setOutput(contexto.getOutput() + "trezentos ");
                                    data = 300;
                                } else {
                                    if (contexto.getInput() >= 200) {
                                        contexto.setOutput(contexto.getOutput() + "duzentos ");
                                        data = 200;
                                    } else {
                                        if (contexto.getInput() > 100) {
                                            contexto.setOutput(contexto.getOutput() + "cento ");
                                            data = 100;
                                        } else {
                                            contexto.setOutput(contexto.getOutput() + "cem ");
                                            data = 100;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        contexto.setInput(contexto.getInput() - data);
        if (contexto.getInput() > 0) {
            contexto.setOutput(contexto.getOutput() + "e ");
        }
    }

    public void dezena(Context contexto) {
        int data = 0;
        if (contexto.getInput() >= 90) {
            contexto.setOutput(contexto.getOutput() + "noventa ");
            data = 90;
        } else {
            if (contexto.getInput() >= 80) {
                contexto.setOutput(contexto.getOutput() + "oitenta ");
                data = 80;
            } else {
                if (contexto.getInput() >= 70) {
                    contexto.setOutput(contexto.getOutput() + "setenta ");
                    data = 70;
                } else {
                    if (contexto.getInput() >= 60) {
                        contexto.setOutput(contexto.getOutput() + "sessenta ");
                        data = 60;
                    } else {
                        if (contexto.getInput() >= 50) {
                            contexto.setOutput(contexto.getOutput() + "cinquenta ");
                            data = 50;
                        } else {
                            if (contexto.getInput() >= 40) {
                                contexto.setOutput(contexto.getOutput() + "quarenta ");
                                data = 40;
                            } else {
                                if (contexto.getInput() >= 30) {
                                    contexto.setOutput(contexto.getOutput() + "trinta ");
                                    data = 30;
                                } else {
                                    if (contexto.getInput() >= 20) {
                                        contexto.setOutput(contexto.getOutput() + "vinte ");
                                        data = 20;
                                    } else {
                                        if (contexto.getInput() > 10) {
                                            switch (contexto.getInput()) {
                                                case 19: {
                                                    contexto.setOutput(contexto.getOutput() + "dezenove ");
                                                    data = 19;
                                                    break;
                                                }
                                                case 18: {
                                                    contexto.setOutput(contexto.getOutput() + "dezoito ");
                                                    data = 18;
                                                    break;
                                                }
                                                case 17: {
                                                    contexto.setOutput(contexto.getOutput() + "dezessete ");
                                                    data = 17;
                                                    break;
                                                }
                                                case 16: {
                                                    contexto.setOutput(contexto.getOutput() + "dezesseis ");
                                                    data = 16;
                                                    break;
                                                }
                                                case 15: {
                                                    contexto.setOutput(contexto.getOutput() + "quize ");
                                                    data = 15;
                                                    break;
                                                }
                                                case 14: {
                                                    contexto.setOutput(contexto.getOutput() + "catorze ");
                                                    data = 14;
                                                    break;
                                                }
                                                case 13: {
                                                    contexto.setOutput(contexto.getOutput() + "treze ");
                                                    data = 13;
                                                    break;
                                                }
                                                case 12: {
                                                    contexto.setOutput(contexto.getOutput() + "doze ");
                                                    data = 12;
                                                    break;
                                                }
                                                case 11: {
                                                    contexto.setOutput(contexto.getOutput() + "onze ");
                                                    data = 11;
                                                    break;
                                                }
                                            }
                                        } else {
                                            contexto.setOutput(contexto.getOutput() + "dez ");
                                            data = 10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        contexto.setInput(contexto.getInput() - data);
        if (contexto.getInput() > 0) {
            contexto.setOutput(contexto.getOutput() + "e ");
        }
    }

    public void unidade(Context contexto) {
        int data = 0;
        switch (contexto.getInput()) {
            case 9: {
                contexto.setOutput(contexto.getOutput() + "nove ");
                data = 9;
                break;
            }
            case 8: {
                contexto.setOutput(contexto.getOutput() + "oito ");
                data = 8;
                break;
            }
            case 7: {
                contexto.setOutput(contexto.getOutput() + "sete ");
                data = 7;
                break;
            }
            case 6: {
                contexto.setOutput(contexto.getOutput() + "seis ");
                data = 6;
                break;
            }
            case 5: {
                contexto.setOutput(contexto.getOutput() + "cinco ");
                data = 5;
                break;
            }
            case 4: {
                contexto.setOutput(contexto.getOutput() + "quatro ");
                data = 4;
                break;
            }
            case 3: {
                contexto.setOutput(contexto.getOutput() + "tres ");
                data = 3;
                break;
            }
            case 2: {
                contexto.setOutput(contexto.getOutput() + "dois ");
                data = 2;
                break;
            }
            case 1: {
                contexto.setOutput(contexto.getOutput() + "um ");
                data = 1;
                break;
            }
        }
        contexto.setInput(contexto.getInput() - data);
    }

    public abstract boolean filtrar(Context contexto);

    public abstract void classe(Context contexto);

}
