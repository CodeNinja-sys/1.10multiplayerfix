/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class aeq
extends mn {
    @Override
    public String a() {
        return "difficulty";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.difficulty.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new ben("commands.difficulty.usage", new Object[0]);
        }
        ct ct2 = this.e(arrstring[0]);
        a2.a((qp)((Object)ct2));
        aeq.a(ala2, (fh)this, "commands.difficulty.success", new du(ct2.b(), new Object[0]));
    }

    protected ct e(String string) {
        if ("peaceful".equalsIgnoreCase(string) || "p".equalsIgnoreCase(string)) {
            return ct.a;
        }
        if ("easy".equalsIgnoreCase(string) || "e".equalsIgnoreCase(string)) {
            return ct.b;
        }
        if ("normal".equalsIgnoreCase(string) || "n".equalsIgnoreCase(string)) {
            return ct.c;
        }
        if ("hard".equalsIgnoreCase(string) || "h".equalsIgnoreCase(string)) {
            return ct.d;
        }
        return ct.a(aeq.a(string, 0, 3));
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return aeq.a(arrstring, "peaceful", "easy", "normal", "hard");
        }
        return Collections.emptyList();
    }
}

