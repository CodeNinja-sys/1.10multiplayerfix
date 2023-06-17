/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.a.am;
import java.util.ListResourceBundle;

public class b
extends ListResourceBundle {
    private static final String a = "data/th.brk";

    public Object[][] getContents() {
        boolean bl2 = am.a(a);
        if (!bl2) {
            return new Object[0][0];
        }
        return new Object[][]{{"BreakIteratorClasses", new String[]{"RuleBasedBreakIterator", "DictionaryBasedBreakIterator", "DictionaryBasedBreakIterator", "RuleBasedBreakIterator"}}, {"WordBreakDictionary", a}, {"LineBreakDictionary", a}};
    }
}

