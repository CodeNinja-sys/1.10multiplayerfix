/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.dg;
import com.a.a.d.mq;
import java.util.regex.Pattern;

class cjr
extends baj {
    private static final Pattern c = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[d|D]");
    private static final Pattern d = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[f|F]");
    private static final Pattern e = Pattern.compile("[-+]?[0-9]+[b|B]");
    private static final Pattern f = Pattern.compile("[-+]?[0-9]+[l|L]");
    private static final Pattern g = Pattern.compile("[-+]?[0-9]+[s|S]");
    private static final Pattern h = Pattern.compile("[-+]?[0-9]+");
    private static final Pattern i = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");
    private static final dg j = dg.a(',').a();
    protected String a;

    public cjr(String string, String string2) {
        this.b = string;
        this.a = string2;
    }

    @Override
    public azt a() {
        try {
            if (c.matcher(this.a).matches()) {
                return new cab(Double.parseDouble(this.a.substring(0, this.a.length() - 1)));
            }
            if (d.matcher(this.a).matches()) {
                return new po(Float.parseFloat(this.a.substring(0, this.a.length() - 1)));
            }
            if (e.matcher(this.a).matches()) {
                return new xg(Byte.parseByte(this.a.substring(0, this.a.length() - 1)));
            }
            if (f.matcher(this.a).matches()) {
                return new ij(Long.parseLong(this.a.substring(0, this.a.length() - 1)));
            }
            if (g.matcher(this.a).matches()) {
                return new ph(Short.parseShort(this.a.substring(0, this.a.length() - 1)));
            }
            if (h.matcher(this.a).matches()) {
                return new iq(Integer.parseInt(this.a));
            }
            if (i.matcher(this.a).matches()) {
                return new cab(Double.parseDouble(this.a));
            }
            if ("true".equalsIgnoreCase(this.a) || "false".equalsIgnoreCase(this.a)) {
                return new xg(Boolean.parseBoolean(this.a) ? (byte)1 : 0);
            }
        }
        catch (NumberFormatException numberFormatException) {
            this.a = this.a.replaceAll("\\\\\"", "\"");
            return new byh(this.a);
        }
        if (this.a.startsWith("[") && this.a.endsWith("]")) {
            String string = this.a.substring(1, this.a.length() - 1);
            String[] arrstring = (String[])mq.a(j.a(string), String.class);
            try {
                int[] arrn = new int[arrstring.length];
                for (int i2 = 0; i2 < arrstring.length; ++i2) {
                    arrn[i2] = Integer.parseInt(arrstring[i2].trim());
                }
                return new aya(arrn);
            }
            catch (NumberFormatException numberFormatException) {
                return new byh(this.a);
            }
        }
        if (this.a.startsWith("\"") && this.a.endsWith("\"")) {
            this.a = this.a.substring(1, this.a.length() - 1);
        }
        this.a = this.a.replaceAll("\\\\\"", "\"");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < this.a.length(); ++i3) {
            if (i3 < this.a.length() - 1 && this.a.charAt(i3) == '\\' && this.a.charAt(i3 + 1) == '\\') {
                stringBuilder.append('\\');
                ++i3;
                continue;
            }
            stringBuilder.append(this.a.charAt(i3));
        }
        return new byh(stringBuilder.toString());
    }
}

