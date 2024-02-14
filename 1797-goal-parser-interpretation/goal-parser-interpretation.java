class Solution {
    public String interpret(String command) {
        //replace method doesn't modify the string in place rather returns new one.
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }
}