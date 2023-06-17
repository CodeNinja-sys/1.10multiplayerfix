/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class afc
extends mn {
    @Override
    public String a() {
        return "ban";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(ala ala2) {
        return "commands.ban.usage";
    }

    @Override
    public boolean a(a a2, ala ala2) {
        return ((cmt)((Object)a2.al())).h().b() && super.a(a2, ala2);
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 1 || arrstring[0].length() <= 0) {
            throw new ben("commands.ban.usage", new Object[0]);
        }
        e e2 = ((bas)((Object)a2.aA())).a(arrstring[0]);
        if (e2 == null) {
            throw new kx("commands.ban.failed", arrstring[0]);
        }
        String string = null;
        if (arrstring.length >= 2) {
            string = afc.a(ala2, arrstring, 1).i();
        }
        nn nn2 = new nn(e2, null, ala2.i_(), null, string);
        ((cmt)((Object)a2.al())).h().a(nn2);
        czt czt2 = ((cmt)((Object)a2.al())).a(arrstring[0]);
        if (czt2 != null) {
            czt2.a.a("You are banned from this server.");
        }
        afc.a(ala2, (fh)this, "commands.ban.success", arrstring[0]);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length >= 1) {
            return afc.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }
}

