/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class cow
extends mn {
    @Override
    public String a() {
        return "pardon";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(ala ala2) {
        return "commands.unban.usage";
    }

    @Override
    public boolean a(a a2, ala ala2) {
        return ((cmt)((Object)a2.al())).h().b() && super.a(a2, ala2);
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length != 1 || arrstring[0].length() <= 0) {
            throw new ben("commands.unban.usage", new Object[0]);
        }
        e e2 = ((cmt)((Object)a2.al())).h().a(arrstring[0]);
        if (e2 == null) {
            throw new kx("commands.unban.failed", arrstring[0]);
        }
        ((cmt)((Object)a2.al())).h().c(e2);
        cow.a(ala2, (fh)this, "commands.unban.success", arrstring[0]);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return cow.a(arrstring, ((cmt)((Object)a2.al())).h().a());
        }
        return Collections.emptyList();
    }
}

