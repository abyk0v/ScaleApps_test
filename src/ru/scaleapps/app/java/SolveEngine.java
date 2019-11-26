package ru.scaleapps.app.java;

import ru.scaleapps.app.java.exception.NotExistingCommand;

public class SolveEngine {

    public String solve(String params) throws NotExistingCommand {
        String[] commandMas = params.split(" {1,}");

        if (commandMas[0].equals("add")) {
            if (commandMas.length < 3)
                throw new NotExistingCommand();
            int sum = 0;
            for (int i = 1; i < commandMas.length; i++) {
                sum += Integer.parseInt(commandMas[i]);
            }
            return "Answer:" + sum;
        }
        else if (commandMas[0].equals("mul")) {
            if (commandMas.length < 3)
                throw new NotExistingCommand();
            int prod = 1;
            for (int i = 1; i < commandMas.length; i++) {
                prod *= Integer.parseInt(commandMas[i]);
            }
            return "Answer:" + prod;
        }
        else if ((commandMas[0].equals("muladd"))) {
            if (commandMas.length != 4)
                throw new NotExistingCommand();
            int answer = Integer.parseInt(commandMas[1]) *
                         Integer.parseInt(commandMas[2]) +
                         Integer.parseInt(commandMas[3]);
            return "Answer:" + answer;
        }
        else throw new NotExistingCommand();
    }
}
