/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import java.util.Locale;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class i
implements j {
    private static final String a = "AEIOUY";
    private static final String[] b = new String[]{"GN", "KN", "PN", "WR", "PS"};
    private static final String[] c = new String[]{"L", "R", "N", "M", "B", "H", "F", "V", "W", " "};
    private static final String[] d = new String[]{"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};
    private static final String[] e = new String[]{"L", "T", "K", "S", "N", "M", "B", "Z"};
    private int f = 4;

    public String a(String string) {
        return this.a(string, false);
    }

    public String a(String string, boolean bl2) {
        if ((string = this.e(string)) == null) {
            return null;
        }
        boolean bl3 = this.c(string);
        int n2 = this.d(string) ? 1 : 0;
        org.apache.commons.a.c.j j2 = new org.apache.commons.a.c.j(this, this.a());
        block25: while (!j2.c() && n2 <= string.length() - 1) {
            switch (string.charAt(n2)) {
                case 'A': 
                case 'E': 
                case 'I': 
                case 'O': 
                case 'U': 
                case 'Y': {
                    n2 = this.a(j2, n2);
                    continue block25;
                }
                case 'B': {
                    j2.a('P');
                    n2 = this.a(string, n2 + 1) == 'B' ? n2 + 2 : n2 + 1;
                    continue block25;
                }
                case '\u00c7': {
                    j2.a('S');
                    ++n2;
                    continue block25;
                }
                case 'C': {
                    n2 = this.a(string, j2, n2);
                    continue block25;
                }
                case 'D': {
                    n2 = this.d(string, j2, n2);
                    continue block25;
                }
                case 'F': {
                    j2.a('F');
                    n2 = this.a(string, n2 + 1) == 'F' ? n2 + 2 : n2 + 1;
                    continue block25;
                }
                case 'G': {
                    n2 = this.a(string, j2, n2, bl3);
                    continue block25;
                }
                case 'H': {
                    n2 = this.f(string, j2, n2);
                    continue block25;
                }
                case 'J': {
                    n2 = this.b(string, j2, n2, bl3);
                    continue block25;
                }
                case 'K': {
                    j2.a('K');
                    n2 = this.a(string, n2 + 1) == 'K' ? n2 + 2 : n2 + 1;
                    continue block25;
                }
                case 'L': {
                    n2 = this.g(string, j2, n2);
                    continue block25;
                }
                case 'M': {
                    j2.a('M');
                    n2 = this.f(string, n2) ? n2 + 2 : n2 + 1;
                    continue block25;
                }
                case 'N': {
                    j2.a('N');
                    n2 = this.a(string, n2 + 1) == 'N' ? n2 + 2 : n2 + 1;
                    continue block25;
                }
                case '\u00d1': {
                    j2.a('N');
                    ++n2;
                    continue block25;
                }
                case 'P': {
                    n2 = this.h(string, j2, n2);
                    continue block25;
                }
                case 'Q': {
                    j2.a('K');
                    n2 = this.a(string, n2 + 1) == 'Q' ? n2 + 2 : n2 + 1;
                    continue block25;
                }
                case 'R': {
                    n2 = this.c(string, j2, n2, bl3);
                    continue block25;
                }
                case 'S': {
                    n2 = this.d(string, j2, n2, bl3);
                    continue block25;
                }
                case 'T': {
                    n2 = this.j(string, j2, n2);
                    continue block25;
                }
                case 'V': {
                    j2.a('F');
                    n2 = this.a(string, n2 + 1) == 'V' ? n2 + 2 : n2 + 1;
                    continue block25;
                }
                case 'W': {
                    n2 = this.k(string, j2, n2);
                    continue block25;
                }
                case 'X': {
                    n2 = this.l(string, j2, n2);
                    continue block25;
                }
                case 'Z': {
                    n2 = this.e(string, j2, n2, bl3);
                    continue block25;
                }
            }
            ++n2;
        }
        return bl2 ? j2.b() : j2.a();
    }

    @Override
    public Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("DoubleMetaphone encode parameter is not of type String");
        }
        return this.a((String)object);
    }

    @Override
    public String b(String string) {
        return this.a(string);
    }

    public boolean a(String string, String string2) {
        return this.a(string, string2, false);
    }

    public boolean a(String string, String string2, boolean bl2) {
        return this.a(string, bl2).equals(this.a(string2, bl2));
    }

    public int a() {
        return this.f;
    }

    public void a(int n2) {
        this.f = n2;
    }

    private int a(org.apache.commons.a.c.j j2, int n2) {
        if (n2 == 0) {
            j2.a('A');
        }
        return n2 + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int a(String string, org.apache.commons.a.c.j j2, int n2) {
        if (this.b(string, n2)) {
            j2.a('K');
            return n2 += 2;
        }
        if (n2 == 0) {
            if (i.a(string, n2, 6, "CAESAR")) {
                j2.a('S');
                return n2 += 2;
            }
        }
        if (i.a(string, n2, 2, "CH")) {
            return this.c(string, j2, n2);
        }
        if (i.a(string, n2, 2, "CZ")) {
            if (!i.a(string, n2 - 2, 4, "WICZ")) {
                j2.a('S', 'X');
                return n2 += 2;
            }
        }
        if (i.a(string, n2 + 1, 3, "CIA")) {
            j2.a('X');
            return n2 += 3;
        }
        if (i.a(string, n2, 2, "CC")) {
            if (n2 != 1) return this.b(string, j2, n2);
            if (this.a(string, 0) != 'M') {
                return this.b(string, j2, n2);
            }
        }
        if (i.a(string, n2, 2, "CK", "CG", "CQ")) {
            j2.a('K');
            return n2 += 2;
        }
        if (i.a(string, n2, 2, "CI", "CE", "CY")) {
            if (i.a(string, n2, 3, "CIO", "CIE", "CIA")) {
                j2.a('S', 'X');
                return n2 += 2;
            } else {
                j2.a('S');
            }
            return n2 += 2;
        }
        j2.a('K');
        if (i.a(string, n2 + 1, 2, " C", " Q", " G")) {
            return n2 += 3;
        }
        if (i.a(string, n2 + 1, 1, "C", "K", "Q")) {
            if (!i.a(string, n2 + 1, 2, "CE", "CI")) {
                return n2 += 2;
            }
        }
        ++n2;
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int b(String var1_1, org.apache.commons.a.c.j var2_2, int var3_3) {
        block2: {
            if (!i.a(var1_1, var3_3 + 2, 1, new String[]{"I", "E", "H"})) break block2;
            if (i.a(var1_1, var3_3 + 2, 2, new String[]{"HU"})) break block2;
            if (var3_3 == 1 && this.a(var1_1, var3_3 - 1) == 'A') ** GOTO lbl-1000
            if (i.a(var1_1, var3_3 - 1, 5, new String[]{"UCCEE", "UCCES"})) lbl-1000:
            // 2 sources

            {
                var2_2.a("KS");
                return var3_3 += 3;
            } else {
                var2_2.a('X');
            }
            return var3_3 += 3;
        }
        var2_2.a('K');
        var3_3 += 2;
        return var3_3;
    }

    private int c(String string, org.apache.commons.a.c.j j2, int n2) {
        if (n2 > 0) {
            if (i.a(string, n2, 4, "CHAE")) {
                j2.a('K', 'X');
                return n2 + 2;
            }
        }
        if (this.c(string, n2)) {
            j2.a('K');
            return n2 + 2;
        }
        if (this.d(string, n2)) {
            j2.a('K');
            return n2 + 2;
        }
        if (n2 > 0) {
            if (i.a(string, 0, 2, "MC")) {
                j2.a('K');
            } else {
                j2.a('X', 'K');
            }
        } else {
            j2.a('X');
        }
        return n2 + 2;
    }

    private int d(String string, org.apache.commons.a.c.j j2, int n2) {
        if (i.a(string, n2, 2, "DG")) {
            if (i.a(string, n2 + 2, 1, "I", "E", "Y")) {
                j2.a('J');
                n2 += 3;
            } else {
                j2.a("TK");
                n2 += 2;
            }
        } else if (i.a(string, n2, 2, "DT", "DD")) {
            j2.a('T');
            n2 += 2;
        } else {
            j2.a('T');
            ++n2;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int a(String var1_1, org.apache.commons.a.c.j var2_2, int var3_3, boolean var4_4) {
        block18: {
            block17: {
                if (this.a(var1_1, var3_3 + 1) == 'H') {
                    return this.e(var1_1, var2_2, var3_3);
                }
                if (this.a(var1_1, var3_3 + 1) == 'N') {
                    if (var3_3 == 1 && this.a(this.a(var1_1, 0)) && !var4_4) {
                        var2_2.a("KN", "N");
                        return var3_3 += 2;
                    } else if (!i.a(var1_1, var3_3 + 2, 2, new String[]{"EY"}) && this.a(var1_1, var3_3 + 1) != 'Y' && !var4_4) {
                        var2_2.a("N", "KN");
                        return var3_3 += 2;
                    } else {
                        var2_2.a("KN");
                    }
                    return var3_3 += 2;
                }
                if (i.a(var1_1, var3_3 + 1, 2, new String[]{"LI"}) && !var4_4) {
                    var2_2.a("KL", "L");
                    return var3_3 += 2;
                }
                if (var3_3 == 0 && (this.a(var1_1, var3_3 + 1) == 'Y' || i.a(var1_1, var3_3 + 1, 2, i.d))) {
                    var2_2.a('K', 'J');
                    return var3_3 += 2;
                }
                if (i.a(var1_1, var3_3 + 1, 2, new String[]{"ER"}) || this.a(var1_1, var3_3 + 1) == 'Y') {
                    if (!i.a(var1_1, 0, 6, new String[]{"DANGER", "RANGER", "MANGER"})) {
                        if (!i.a(var1_1, var3_3 - 1, 1, new String[]{"E", "I"})) {
                            if (!i.a(var1_1, var3_3 - 1, 3, new String[]{"RGY", "OGY"})) {
                                var2_2.a('K', 'J');
                                return var3_3 += 2;
                            }
                        }
                    }
                }
                if (i.a(var1_1, var3_3 + 1, 1, new String[]{"E", "I", "Y"})) break block17;
                if (!i.a(var1_1, var3_3 - 1, 4, new String[]{"AGGI", "OGGI"})) break block18;
            }
            if (i.a(var1_1, 0, 4, new String[]{"VAN ", "VON "})) ** GOTO lbl-1000
            if (i.a(var1_1, 0, 3, new String[]{"SCH"})) ** GOTO lbl-1000
            if (i.a(var1_1, var3_3 + 1, 2, new String[]{"ET"})) lbl-1000:
            // 3 sources

            {
                var2_2.a('K');
                return var3_3 += 2;
            } else if (i.a(var1_1, var3_3 + 1, 3, new String[]{"IER"})) {
                var2_2.a('J');
                return var3_3 += 2;
            } else {
                var2_2.a('J', 'K');
            }
            return var3_3 += 2;
        }
        if (this.a(var1_1, var3_3 + 1) == 'G') {
            var2_2.a('K');
            return var3_3 += 2;
        }
        ++var3_3;
        var2_2.a('K');
        return var3_3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int e(String var1_1, org.apache.commons.a.c.j var2_2, int var3_3) {
        if (var3_3 > 0 && !this.a(this.a(var1_1, var3_3 - 1))) {
            var2_2.a('K');
            return var3_3 += 2;
        }
        if (var3_3 == 0) {
            if (this.a(var1_1, var3_3 + 2) == 'I') {
                var2_2.a('J');
                return var3_3 += 2;
            } else {
                var2_2.a('K');
            }
            return var3_3 += 2;
        }
        if (var3_3 > 1) {
            if (i.a(var1_1, var3_3 - 2, 1, new String[]{"B", "H", "D"})) return var3_3 += 2;
        }
        if (var3_3 > 2) {
            if (i.a(var1_1, var3_3 - 3, 1, new String[]{"B", "H", "D"})) return var3_3 += 2;
        }
        if (var3_3 > 3) {
            if (i.a(var1_1, var3_3 - 4, 1, new String[]{"B", "H"})) {
                return var3_3 += 2;
            }
        }
        if (var3_3 <= 2 || this.a(var1_1, var3_3 - 1) != 'U') ** GOTO lbl-1000
        if (i.a(var1_1, var3_3 - 3, 1, new String[]{"C", "G", "L", "R", "T"})) {
            var2_2.a('F');
        } else if (var3_3 > 0 && this.a(var1_1, var3_3 - 1) != 'I') {
            var2_2.a('K');
        }
        var3_3 += 2;
        return var3_3;
    }

    private int f(String string, org.apache.commons.a.c.j j2, int n2) {
        if ((n2 == 0 || this.a(this.a(string, n2 - 1))) && this.a(this.a(string, n2 + 1))) {
            j2.a('H');
            n2 += 2;
        } else {
            ++n2;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int b(String var1_1, org.apache.commons.a.c.j var2_2, int var3_3, boolean var4_4) {
        block12: {
            block11: {
                if (i.a(var1_1, var3_3, 4, new String[]{"JOSE"})) break block11;
                if (!i.a(var1_1, 0, 4, new String[]{"SAN "})) break block12;
            }
            if (var3_3 == 0 && this.a(var1_1, var3_3 + 4) == ' ' || var1_1.length() == 4) ** GOTO lbl-1000
            if (i.a(var1_1, 0, 4, new String[]{"SAN "})) lbl-1000:
            // 2 sources

            {
                var2_2.a('H');
                return ++var3_3;
            } else {
                var2_2.a('J', 'H');
            }
            return ++var3_3;
        }
        if (var3_3 != 0) ** GOTO lbl-1000
        if (!i.a(var1_1, var3_3, 4, new String[]{"JOSE"})) {
            var2_2.a('J', 'A');
        } else if (this.a(this.a(var1_1, var3_3 - 1)) && !var4_4 && (this.a(var1_1, var3_3 + 1) == 'A' || this.a(var1_1, var3_3 + 1) == 'O')) {
            var2_2.a('J', 'H');
        } else if (var3_3 == var1_1.length() - 1) {
            var2_2.a('J', ' ');
        } else if (!i.a(var1_1, var3_3 + 1, 1, i.e)) {
            if (!i.a(var1_1, var3_3 - 1, 1, new String[]{"S", "K", "L"})) {
                var2_2.a('J');
            }
        }
        if (this.a(var1_1, var3_3 + 1) == 'J') {
            return var3_3 += 2;
        }
        ++var3_3;
        return var3_3;
    }

    private int g(String string, org.apache.commons.a.c.j j2, int n2) {
        if (this.a(string, n2 + 1) == 'L') {
            if (this.e(string, n2)) {
                j2.b('L');
            } else {
                j2.a('L');
            }
            n2 += 2;
        } else {
            ++n2;
            j2.a('L');
        }
        return n2;
    }

    private int h(String string, org.apache.commons.a.c.j j2, int n2) {
        if (this.a(string, n2 + 1) == 'H') {
            j2.a('F');
            n2 += 2;
        } else {
            j2.a('P');
            n2 = i.a(string, n2 + 1, 1, "P", "B") ? n2 + 2 : n2 + 1;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int c(String var1_1, org.apache.commons.a.c.j var2_2, int var3_3, boolean var4_4) {
        if (var3_3 != var1_1.length() - 1 || var4_4) ** GOTO lbl-1000
        if (!i.a(var1_1, var3_3 - 2, 2, new String[]{"IE"})) ** GOTO lbl-1000
        if (!i.a(var1_1, var3_3 - 4, 2, new String[]{"ME", "MA"})) {
            var2_2.c('R');
        } else lbl-1000:
        // 3 sources

        {
            var2_2.a('R');
        }
        if (this.a(var1_1, var3_3 + 1) == 'R') {
            v0 = var3_3 + 2;
            return v0;
        }
        v0 = var3_3 + 1;
        return v0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int d(String var1_1, org.apache.commons.a.c.j var2_2, int var3_3, boolean var4_4) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            if (i.a(var1_1, var3_3 - 1, 3, new String[]{"ISL", "YSL"})) {
                                return ++var3_3;
                            }
                            if (var3_3 == 0) {
                                if (i.a(var1_1, var3_3, 5, new String[]{"SUGAR"})) {
                                    var2_2.a('X', 'S');
                                    return ++var3_3;
                                }
                            }
                            if (i.a(var1_1, var3_3, 2, new String[]{"SH"})) {
                                if (i.a(var1_1, var3_3 + 1, 4, new String[]{"HEIM", "HOEK", "HOLM", "HOLZ"})) {
                                    var2_2.a('S');
                                    return var3_3 += 2;
                                } else {
                                    var2_2.a('X');
                                }
                                return var3_3 += 2;
                            }
                            if (i.a(var1_1, var3_3, 3, new String[]{"SIO", "SIA"})) break block17;
                            if (!i.a(var1_1, var3_3, 4, new String[]{"SIAN"})) break block18;
                        }
                        if (var4_4) {
                            var2_2.a('S');
                            return var3_3 += 3;
                        } else {
                            var2_2.a('S', 'X');
                        }
                        return var3_3 += 3;
                    }
                    if (var3_3 != 0) break block19;
                    if (i.a(var1_1, var3_3 + 1, 1, new String[]{"M", "N", "L", "W"})) break block20;
                }
                if (!i.a(var1_1, var3_3 + 1, 1, new String[]{"Z"})) break block21;
            }
            var2_2.a('S', 'X');
            return i.a(var1_1, var3_3 + 1, 1, new String[]{"Z"}) != false ? var3_3 + 2 : var3_3 + 1;
        }
        if (i.a(var1_1, var3_3, 2, new String[]{"SC"})) {
            return this.i(var1_1, var2_2, var3_3);
        }
        if (var3_3 != var1_1.length() - 1) ** GOTO lbl-1000
        if (i.a(var1_1, var3_3 - 2, 2, new String[]{"AI", "OI"})) {
            var2_2.c('S');
            return i.a(var1_1, var3_3 + 1, 1, new String[]{"S", "Z"}) != false ? var3_3 + 2 : var3_3 + 1;
        } else lbl-1000:
        // 2 sources

        {
            var2_2.a('S');
        }
        return i.a(var1_1, var3_3 + 1, 1, new String[]{"S", "Z"}) != false ? var3_3 + 2 : var3_3 + 1;
    }

    private int i(String string, org.apache.commons.a.c.j j2, int n2) {
        if (this.a(string, n2 + 2) == 'H') {
            if (i.a(string, n2 + 3, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (i.a(string, n2 + 3, 2, "ER", "EN")) {
                    j2.a("X", "SK");
                } else {
                    j2.a("SK");
                }
            } else if (n2 == 0 && !this.a(this.a(string, 3)) && this.a(string, 3) != 'W') {
                j2.a('X', 'S');
            } else {
                j2.a('X');
            }
        } else if (i.a(string, n2 + 2, 1, "I", "E", "Y")) {
            j2.a('S');
        } else {
            j2.a("SK");
        }
        return n2 + 3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int j(String var1_1, org.apache.commons.a.c.j var2_2, int var3_3) {
        block5: {
            block4: {
                if (i.a(var1_1, var3_3, 4, new String[]{"TION"})) {
                    var2_2.a('X');
                    return var3_3 += 3;
                }
                if (i.a(var1_1, var3_3, 3, new String[]{"TIA", "TCH"})) {
                    var2_2.a('X');
                    return var3_3 += 3;
                }
                if (i.a(var1_1, var3_3, 2, new String[]{"TH"})) break block4;
                if (!i.a(var1_1, var3_3, 3, new String[]{"TTH"})) break block5;
            }
            if (i.a(var1_1, var3_3 + 2, 2, new String[]{"OM", "AM"})) ** GOTO lbl-1000
            if (i.a(var1_1, 0, 4, new String[]{"VAN ", "VON "})) ** GOTO lbl-1000
            if (i.a(var1_1, 0, 3, new String[]{"SCH"})) lbl-1000:
            // 3 sources

            {
                var2_2.a('T');
                return var3_3 += 2;
            } else {
                var2_2.a('0', 'T');
            }
            return var3_3 += 2;
        }
        var2_2.a('T');
        return i.a(var1_1, var3_3 + 1, 1, new String[]{"T", "D"}) != false ? var3_3 + 2 : var3_3 + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int k(String string, org.apache.commons.a.c.j j2, int n2) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        if (i.a(string, n2, 2, "WR")) {
                            j2.a('R');
                            return n2 += 2;
                        }
                        if (n2 != 0) break block10;
                        if (this.a(this.a(string, n2 + 1))) break block11;
                        if (!i.a(string, n2, 2, "WH")) break block10;
                    }
                    if (this.a(this.a(string, n2 + 1))) {
                        j2.a('A', 'F');
                        return ++n2;
                    } else {
                        j2.a('A');
                    }
                    return ++n2;
                }
                if (n2 == string.length() - 1 && this.a(this.a(string, n2 - 1))) break block12;
                if (i.a(string, n2 - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) break block12;
                if (!i.a(string, 0, 3, "SCH")) break block13;
            }
            j2.c('F');
            return ++n2;
        }
        if (i.a(string, n2, 4, "WICZ", "WITZ")) {
            j2.a("TS", "FX");
            return n2 += 4;
        }
        ++n2;
        return n2;
    }

    private int l(String string, org.apache.commons.a.c.j j2, int n2) {
        block3: {
            block5: {
                block4: {
                    block2: {
                        if (n2 != 0) break block2;
                        j2.a('S');
                        ++n2;
                        break block3;
                    }
                    if (n2 != string.length() - 1) break block4;
                    if (i.a(string, n2 - 3, 3, "IAU", "EAU")) break block5;
                    if (i.a(string, n2 - 2, 2, "AU", "OU")) break block5;
                }
                j2.a("KS");
            }
            n2 = i.a(string, n2 + 1, 1, "C", "X") ? n2 + 2 : n2 + 1;
        }
        return n2;
    }

    private int e(String string, org.apache.commons.a.c.j j2, int n2, boolean bl2) {
        if (this.a(string, n2 + 1) == 'H') {
            j2.a('J');
            n2 += 2;
        } else {
            if (i.a(string, n2 + 1, 2, "ZO", "ZI", "ZA") || bl2 && n2 > 0 && this.a(string, n2 - 1) != 'T') {
                j2.a("S", "TS");
            } else {
                j2.a('S');
            }
            n2 = this.a(string, n2 + 1) == 'Z' ? n2 + 2 : n2 + 1;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(String string, int n2) {
        if (i.a(string, n2, 4, "CHIA")) {
            return true;
        }
        if (n2 <= 1) {
            return false;
        }
        if (this.a(this.a(string, n2 - 2))) {
            return false;
        }
        if (!i.a(string, n2 - 1, 3, "ACH")) {
            return false;
        }
        char c2 = this.a(string, n2 + 2);
        if (c2 != 'I') {
            if (c2 != 'E') return true;
        }
        if (!i.a(string, n2 - 2, 6, "BACHER", "MACHER")) return false;
        return true;
    }

    private boolean c(String string, int n2) {
        if (n2 != 0) {
            return false;
        }
        if (!i.a(string, n2 + 1, 5, "HARAC", "HARIS")) {
            if (!i.a(string, n2 + 1, 3, "HOR", "HYM", "HIA", "HEM")) {
                return false;
            }
        }
        return !i.a(string, 0, 5, "CHORE");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean d(String string, int n2) {
        if (i.a(string, 0, 4, "VAN ", "VON ")) return true;
        if (i.a(string, 0, 3, "SCH")) return true;
        if (i.a(string, n2 - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) return true;
        if (i.a(string, n2 + 2, 1, "T", "S")) return true;
        if (!i.a(string, n2 - 1, 1, "A", "O", "U", "E")) {
            if (n2 != 0) return false;
        }
        if (i.a(string, n2 + 2, 1, c)) return true;
        if (n2 + 1 != string.length() - 1) return false;
        return true;
    }

    private boolean e(String string, int n2) {
        block7: {
            block6: {
                if (n2 == string.length() - 3) {
                    if (i.a(string, n2 - 1, 4, "ILLO", "ILLA", "ALLE")) {
                        return true;
                    }
                }
                if (i.a(string, string.length() - 2, 2, "AS", "OS")) break block6;
                if (!i.a(string, string.length() - 1, 1, "A", "O")) break block7;
            }
            if (i.a(string, n2 - 1, 4, "ALLE")) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean f(String string, int n2) {
        if (this.a(string, n2 + 1) == 'M') {
            return true;
        }
        if (!i.a(string, n2 - 1, 3, "UMB")) return false;
        if (n2 + 1 == string.length() - 1) return true;
        if (!i.a(string, n2 + 2, 2, "ER")) return false;
        return true;
    }

    private boolean c(String string) {
        return string.indexOf(87) > -1 || string.indexOf(75) > -1 || string.indexOf("CZ") > -1 || string.indexOf("WITZ") > -1;
    }

    private boolean a(char c2) {
        return a.indexOf(c2) != -1;
    }

    private boolean d(String string) {
        boolean bl2 = false;
        for (String string2 : b) {
            if (!string.startsWith(string2)) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    private String e(String string) {
        if (string == null) {
            return null;
        }
        if ((string = string.trim()).length() == 0) {
            return null;
        }
        return string.toUpperCase(Locale.ENGLISH);
    }

    protected char a(String string, int n2) {
        if (n2 < 0 || n2 >= string.length()) {
            return '\u0000';
        }
        return string.charAt(n2);
    }

    protected static boolean a(String string, int n2, int n3, String ... arrstring) {
        boolean bl2 = false;
        if (n2 >= 0 && n2 + n3 <= string.length()) {
            String string2 = string.substring(n2, n2 + n3);
            for (String string3 : arrstring) {
                if (!string2.equals(string3)) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }
}

