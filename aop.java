/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class aop
extends mn {
    @Override
    public String a() {
        return "setworldspawn";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.setworldspawn.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        cmz cmz2;
        if (arrstring.length == 0) {
            cmz2 = aop.b(ala2).k_();
        } else if (arrstring.length == 3 && ala2.m_() != null) {
            cmz2 = aop.a(ala2, arrstring, 0, true);
        } else {
            throw new ben("commands.setworldspawn.usage", new Object[0]);
        }
        ala2.m_().z(cmz2);
        ((cmt)((Object)a2.al())).a(new bxi(cmz2));
        aop.a(ala2, (fh)this, "commands.setworldspawn.success", cmz2.a(), cmz2.b(), cmz2.c());
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length > 0 && arrstring.length <= 3) {
            return aop.a(arrstring, 0, cmz2);
        }
        return Collections.emptyList();
    }
}

