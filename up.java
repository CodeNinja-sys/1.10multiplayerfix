/*
 * Decompiled with CFR 0.150.
 */
import org.apache.commons.c.am;

public class up
extends bpx {
    private final String c;

    protected up(int n2, String ... arrstring) {
        super(0, arrstring[0], arrstring[1]);
        this.c = am.a((CharSequence)arrstring[2]) ? "normal" : arrstring[2].toLowerCase();
    }

    public up(String string) {
        this(0, up.a(string));
    }

    public up(bpx bpx2, String string) {
        this(bpx2.toString(), string);
    }

    public up(String string, String string2) {
        this(0, up.a(string + '#' + (string2 == null ? "normal" : string2)));
    }

    protected static String[] a(String string) {
        String[] arrstring = new String[]{null, string, null};
        int n2 = string.indexOf(35);
        String string2 = string;
        if (n2 >= 0) {
            arrstring[2] = string.substring(n2 + 1, string.length());
            if (n2 > 1) {
                string2 = string.substring(0, n2);
            }
        }
        System.arraycopy(bpx.b(string2), 0, arrstring, 0, 2);
        return arrstring;
    }

    public String a() {
        return this.c;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof up && super.equals(object)) {
            up up2 = (up)object;
            return this.c.equals(up2.c);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.c.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + '#' + this.c;
    }
}

