package xyz.galaxyy.lualink.addons.discordsrv.functions;

import github.scarsz.discordsrv.DiscordSRV;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ZeroArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public final class LuaFunctions {
  public static final LuaFunction GET_PLUGIN =
      new ZeroArgFunction() {
        @Override
        public LuaValue call() {
          return CoerceJavaToLua.coerce(DiscordSRV.getPlugin());
        }
      };
}
