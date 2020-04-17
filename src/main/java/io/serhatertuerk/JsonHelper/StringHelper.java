package io.serhatertuerk.JsonHelper;

public class StringHelper {

    /**
     * @param string_with_brackets the whole json
     * @return json without "[" at beginning and "]" at end
     */
    protected static String remove_bracket_at_beg_end(String string_with_brackets) {
        if(string_with_brackets.startsWith("[")) {
            string_with_brackets = string_with_brackets.substring(1);
        }
        if(string_with_brackets.endsWith("]")) {
            string_with_brackets = string_with_brackets.substring(0, string_with_brackets.length() - 1);
        }
        return string_with_brackets;
    }
}
