/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class bir
extends mn {
    @Override
    public String a() {
        return "xp";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.xp.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        czt czt2;
        int n2;
        boolean bl2;
        boolean bl3;
        if (arrstring.length <= 0) {
            throw new ben("commands.xp.usage", new Object[0]);
        }
        String string = arrstring[0];
        boolean bl4 = bl3 = string.endsWith("l") || string.endsWith("L");
        if (bl3 && string.length() > 1) {
            string = string.substring(0, string.length() - 1);
        }
        boolean bl5 = bl2 = (n2 = bir.a(string)) < 0;
        if (bl2) {
            n2 *= -1;
        }
        czt czt3 = czt2 = arrstring.length > 1 ? bir.a(a2, ala2, arrstring[1]) : bir.b(ala2);
        if (bl3) {
            ala2.a(bnw.e, czt2.H);
            if (bl2) {
                ((bdl)czt2).j(-n2);
                bir.a(ala2, (fh)this, "commands.xp.success.negative.levels", n2, czt2.i_());
            } else {
                ((bdl)czt2).j(n2);
                bir.a(ala2, (fh)this, "commands.xp.success.levels", n2, czt2.i_());
            }
        } else {
            ala2.a(bnw.e, czt2.I);
            if (bl2) {
                throw new kx("commands.xp.failure.widthdrawXp", new Object[0]);
            }
            czt2.h(n2);
            bir.a(ala2, (fh)this, "commands.xp.success", n2, czt2.i_());
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 2) {
            return bir.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 1;
    }
}

