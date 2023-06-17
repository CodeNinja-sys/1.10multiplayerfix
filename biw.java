/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class biw
extends mn {
    @Override
    public String a() {
        return "trigger";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(ala ala2) {
        return "commands.trigger.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        Object object;
        czt czt2;
        if (arrstring.length < 3) {
            throw new ben("commands.trigger.usage", new Object[0]);
        }
        if (ala2 instanceof czt) {
            czt2 = (czt)ala2;
        } else {
            object = ala2.n_();
            if (object instanceof czt) {
                czt2 = (czt)object;
            } else {
                throw new kx("commands.trigger.invalidPlayer", new Object[0]);
            }
        }
        object = ((iu)((Object)a2.a(0))).P();
        bhi bhi2 = ((bzt)object).b(arrstring[0]);
        if (bhi2 == null || bhi2.c() != bcu.c) {
            throw new kx("commands.trigger.invalidObjective", arrstring[0]);
        }
        int n2 = biw.a(arrstring[2]);
        if (!((bzt)object).b(czt2.i_(), bhi2)) {
            throw new kx("commands.trigger.invalidObjective", arrstring[0]);
        }
        czu czu2 = ((bzt)object).c(czt2.i_(), bhi2);
        if (czu2.f()) {
            throw new kx("commands.trigger.disabled", arrstring[0]);
        }
        if ("set".equals(arrstring[1])) {
            czu2.c(n2);
        } else if ("add".equals(arrstring[1])) {
            czu2.a(n2);
        } else {
            throw new kx("commands.trigger.invalidMode", arrstring[1]);
        }
        czu2.a(true);
        if (czt2.c.d()) {
            biw.a(ala2, (fh)this, "commands.trigger.success", arrstring[0], arrstring[1], arrstring[2]);
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            bzt bzt2 = ((iu)((Object)a2.a(0))).P();
            ArrayList arrayList = ov.a();
            for (bhi bhi2 : bzt2.b()) {
                if (bhi2.c() != bcu.c) continue;
                arrayList.add(bhi2.b());
            }
            return biw.a(arrstring, arrayList.toArray(new String[arrayList.size()]));
        }
        if (arrstring.length == 2) {
            return biw.a(arrstring, "add", "set");
        }
        return Collections.emptyList();
    }
}

