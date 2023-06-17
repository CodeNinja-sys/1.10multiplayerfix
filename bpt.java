/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class bpt
extends mn {
    @Override
    public String a() {
        return "kick";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(ala ala2) {
        return "commands.kick.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length <= 0 || arrstring[0].length() <= 1) {
            throw new ben("commands.kick.usage", new Object[0]);
        }
        czt czt2 = ((cmt)((Object)a2.al())).a(arrstring[0]);
        String string = "Kicked by an operator.";
        boolean bl2 = false;
        if (czt2 == null) {
            throw new chs();
        }
        if (arrstring.length >= 2) {
            string = bpt.a(ala2, arrstring, 1).i();
            bl2 = true;
        }
        czt2.a.a(string);
        if (bl2) {
            bpt.a(ala2, (fh)this, "commands.kick.success.reason", czt2.i_(), string);
        } else {
            bpt.a(ala2, (fh)this, "commands.kick.success", czt2.i_());
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length >= 1) {
            return bpt.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }
}

