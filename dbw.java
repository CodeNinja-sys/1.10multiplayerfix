/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class dbw
extends mn {
    @Override
    public String a() {
        return "stopsound";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.stopsound.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        Object object;
        if (arrstring.length < 1 || arrstring.length > 3) {
            throw new ben(this.a(ala2), new Object[0]);
        }
        int n2 = 0;
        czt czt2 = dbw.a(a2, ala2, arrstring[n2++]);
        String string = "";
        String string2 = "";
        if (arrstring.length >= 2) {
            csg csg2;
            if ((csg2 = csg.a((String)(object = arrstring[n2++]))) == null) {
                throw new kx("commands.stopsound.unknownSoundSource", object);
            }
            string = csg2.a();
        }
        if (arrstring.length == 3) {
            string2 = arrstring[n2++];
        }
        object = new si(io.netty.b.bi.a());
        ((si)object).a(string);
        ((si)object).a(string2);
        czt2.a.a(new afw("MC|StopSound", (si)object));
        if (string.isEmpty() && string2.isEmpty()) {
            dbw.a(ala2, (fh)this, "commands.stopsound.success.all", czt2.i_());
        } else if (string2.isEmpty()) {
            dbw.a(ala2, (fh)this, "commands.stopsound.success.soundSource", string, czt2.i_());
        } else {
            dbw.a(ala2, (fh)this, "commands.stopsound.success.individualSound", string2, string, czt2.i_());
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return dbw.a(arrstring, a2.J());
        }
        if (arrstring.length == 2) {
            return dbw.a(arrstring, csg.b());
        }
        if (arrstring.length == 3) {
            return dbw.a(arrstring, bi.a.c());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

