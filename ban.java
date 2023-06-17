/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class ban
extends mn {
    @Override
    public String a() {
        return "banlist";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public boolean a(a a2, ala ala2) {
        return (((cmt)((Object)a2.al())).i().b() || ((cmt)((Object)a2.al())).h().b()) && super.a(a2, ala2);
    }

    @Override
    public String a(ala ala2) {
        return "commands.banlist.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length >= 1 && "ips".equalsIgnoreCase(arrstring[0])) {
            ala2.a(new du("commands.banlist.ips", ((cmt)((Object)a2.al())).i().a().length));
            ala2.a(new aym(ban.a(((cmt)((Object)a2.al())).i().a())));
        } else {
            ala2.a(new du("commands.banlist.players", ((cmt)((Object)a2.al())).h().a().length));
            ala2.a(new aym(ban.a(((cmt)((Object)a2.al())).h().a())));
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return ban.a(arrstring, "players", "ips");
        }
        return Collections.emptyList();
    }
}

