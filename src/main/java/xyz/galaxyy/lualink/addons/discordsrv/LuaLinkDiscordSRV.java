package xyz.galaxyy.lualink.addons.discordsrv;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.galaxyy.lualink.addons.discordsrv.functions.LuaFunctions;
import xyz.galaxyy.lualink.api.LuaLinkAPI;
import xyz.galaxyy.lualink.api.addons.LuaAddon;

public final class LuaLinkDiscordSRV extends JavaPlugin {
  @Override
  public void onEnable() {
    if (this.getServer().getPluginManager().isPluginEnabled("DiscordSRV") == false)
      throw new IllegalStateException("Plugin DiscordSRV must be loaded for this addon to work");
    final LuaAddon luaAddon = new LuaAddon();
    luaAddon.addFunction("getPlugin", LuaFunctions.GET_PLUGIN);

    LuaLinkAPI.Companion.registerAddon("DiscordSRV", luaAddon);
  }
}
