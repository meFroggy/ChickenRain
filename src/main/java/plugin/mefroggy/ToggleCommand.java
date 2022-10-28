package plugin.mefroggy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ToggleCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0){
            return false;
        }

        switch (args[0]){
            case "on":
                ChickenSpawn.spawn = true;
                break;
            case "off":
                ChickenSpawn.spawn = false;
                break;
            default:
                return false;
        }
        return false;
    }
}