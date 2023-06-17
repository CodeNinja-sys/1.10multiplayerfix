/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class bip
extends mn {
    @Override
    public String a() {
        return "gamemode";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.gamemode.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new ben("commands.gamemode.usage", new Object[0]);
        }
        bvh bvh2 = this.c(ala2, arrstring[0]);
        czt czt2 = arrstring.length >= 2 ? bip.a(a2, ala2, arrstring[1]) : bip.b(ala2);
        ((bdl)czt2).a(bvh2);
        du du2 = new du("gameMode." + bvh2.b(), new Object[0]);
        if (ala2.m_().F().b("sendCommandFeedback")) {
            ((cpk)czt2).a(new du("gameMode.changed", du2));
        }
        if (czt2 == ala2) {
            bip.a(ala2, (fh)this, 1, "commands.gamemode.success.self", du2);
        } else {
            bip.a(ala2, (fh)this, 1, "commands.gamemode.success.other", czt2.i_(), du2);
        }
    }

    protected bvh c(ala ala2, String string) {
        bvh bvh2 = bvh.a(string, bvh.a);
        return bvh2 == bvh.a ? atd.a(bip.a(string, 0, bvh.values().length - 2)) : bvh2;
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return bip.a(arrstring, "survival", "creative", "adventure", "spectator");
        }
        if (arrstring.length == 2) {
            return bip.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 1;
    }
}

