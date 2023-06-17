/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class cob
extends mn {
    @Override
    public String a() {
        return "kill";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.kill.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length == 0) {
            czt czt2 = cob.b(ala2);
            czt2.v_();
            cob.a(ala2, (fh)this, "commands.kill.successful", czt2.v());
            return;
        }
        cpk cpk2 = cob.b(a2, ala2, arrstring[0]);
        cpk2.v_();
        cob.a(ala2, (fh)this, "commands.kill.successful", cpk2.v());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return cob.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }
}

