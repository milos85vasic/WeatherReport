package com.weather_report;

import com.weather_report.commands.COMMAND;
import com.weather_report.commands.CommandsManager;
import com.weather_report.data.KeyValuePair;

public class Main {

    public static void main(String[] args) {
        try {
            KeyValuePair<COMMAND, KeyValuePair> command = CommandsManager.INSTANCE.retrieve(args);
            CommandsManager.INSTANCE.execute(command);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
