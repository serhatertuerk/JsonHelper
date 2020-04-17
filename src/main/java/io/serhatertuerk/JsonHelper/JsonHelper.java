package io.serhatertuerk.JsonHelper;

import org.json.JSONObject;

public class JsonHelper extends StringHelper{

    /**
     * @param json_string the whole json
     * @param key key of the json
     * @return the value for the specific key
     */
    public static String get_value_from_key(String json_string, String key) {
        json_string = remove_bracket_at_beg_end(json_string);

        JSONObject json_object = new JSONObject(json_string);
        return json_object.get(key).toString();
    }

    /**
     * Checks, if json format is correct
     * @param json_string the whole json
     * @return true, if json is broken, false if not
     */
    public static boolean check_json_broken(String json_string) {
        json_string = remove_bracket_at_beg_end(json_string);

        try {
            new JSONObject(json_string);
            return false;
        }
        catch(Exception e) {
            return true;
        }
    }
}
