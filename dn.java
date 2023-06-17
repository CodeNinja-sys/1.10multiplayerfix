/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class dn
extends mn {
    @Override
    public String a() {
        return "deop";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(ala ala2) {
        return "commands.deop.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length != 1 || arrstring[0].length() <= 0) {
            throw new ben("commands.deop.usage", new Object[0]);
        }
        e e2 = ((cmt)((Object)a2.al())).m().a(arrstring[0]);
        if (e2 == null) {
            throw new kx("commands.deop.failed", arrstring[0]);
        }
        ((cmt)((Object)a2.al())).c(e2);
        dn.a(ala2, (fh)this, "commands.deop.success", arrstring[0]);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return dn.a(arrstring, ((cmt)((Object)a2.al())).n());
        }
        return Collections.emptyList();
    }
}

