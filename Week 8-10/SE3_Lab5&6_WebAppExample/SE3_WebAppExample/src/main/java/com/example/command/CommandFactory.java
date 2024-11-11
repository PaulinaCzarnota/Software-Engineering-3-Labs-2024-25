package com.example.command;

import com.example.exceptions.CommandCreationException;

public class CommandFactory {

    private static CommandFactory factory = null;

    private CommandFactory() {
    }

    /**
     * Get an instance of the CommandFactory
     * @return The singleton CommandFactory object
     */
    public synchronized static CommandFactory getInstance() {
        if (factory == null) { // first time
            factory = new CommandFactory();
        }
        return factory;
    }

    /**
     * Creates a command based on the command string
     * @param commandStr Identifier for the exact Command object required
     * @return The specific Command object requested
     * @throws CommandCreationException 
     */
    public synchronized Command createCommand(String commandStr) throws CommandCreationException {
        Command command = null;
        String packageName = "com.example.command."; 

        try {
            commandStr = packageName + commandStr + "Command";
            Class<?> theClass = Class.forName(commandStr);
            Object theObject = theClass.newInstance();
            command = (Command) theObject;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new CommandCreationException("CommandFactory: " + e);
        }

        return command; // may be null
    }
}