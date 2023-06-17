/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class aod
extends mn {
    @Override
    public String a() {
        return "whitelist";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(ala ala2) {
        return "commands.whitelist.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 1) {
            throw new ben("commands.whitelist.usage", new Object[0]);
        }
        if ("on".equals(arrstring[0])) {
            ((cmt)((Object)a2.al())).b(true);
            aod.a(ala2, (fh)this, "commands.whitelist.enabled", new Object[0]);
        } else if ("off".equals(arrstring[0])) {
            ((cmt)((Object)a2.al())).b(false);
            aod.a(ala2, (fh)this, "commands.whitelist.disabled", new Object[0]);
        } else if ("list".equals(arrstring[0])) {
            ala2.a(new du("commands.whitelist.list", ((cmt)((Object)a2.al())).l().length, ((cmt)((Object)a2.al())).r().length));
            Object[] arrobject = ((cmt)((Object)a2.al())).l();
            ala2.a(new aym(aod.a(arrobject)));
        } else if ("add".equals(arrstring[0])) {
            if (arrstring.length < 2) {
                throw new ben("commands.whitelist.add.usage", new Object[0]);
            }
            e e2 = ((bas)((Object)a2.aA())).a(arrstring[1]);
            if (e2 == null) {
                throw new kx("commands.whitelist.add.failed", arrstring[1]);
            }
            ((cmt)((Object)a2.al())).f(e2);
            aod.a(ala2, (fh)this, "commands.whitelist.add.success", arrstring[1]);
        } else if ("remove".equals(arrstring[0])) {
            if (arrstring.length < 2) {
                throw new ben("commands.whitelist.remove.usage", new Object[0]);
            }
            e e3 = ((cmt)((Object)a2.al())).k().a(arrstring[1]);
            if (e3 == null) {
                throw new kx("commands.whitelist.remove.failed", arrstring[1]);
            }
            ((cmt)((Object)a2.al())).g(e3);
            aod.a(ala2, (fh)this, "commands.whitelist.remove.success", arrstring[1]);
        } else if ("reload".equals(arrstring[0])) {
            ((cmt)((Object)a2.al())).o();
            aod.a(ala2, (fh)this, "commands.whitelist.reloaded", new Object[0]);
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return aod.a(arrstring, "on", "off", "list", "add", "remove", "reload");
        }
        if (arrstring.length == 2) {
            if ("remove".equals(arrstring[0])) {
                return aod.a(arrstring, ((cmt)((Object)a2.al())).l());
            }
            if ("add".equals(arrstring[0])) {
                return aod.a(arrstring, ((bas)((Object)a2.aA())).a());
            }
        }
        return Collections.emptyList();
    }
}

