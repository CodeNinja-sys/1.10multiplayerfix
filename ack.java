/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.net.IDN;

class ack
implements cm {
    final /* synthetic */ rd a;

    ack(rd rd2) {
        this.a = rd2;
    }

    public boolean a(String string) {
        if (aco.b(string)) {
            return true;
        }
        String[] arrstring = string.split(":");
        if (arrstring.length == 0) {
            return true;
        }
        try {
            String string2 = IDN.toASCII(arrstring[0]);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((String)object);
    }
}

