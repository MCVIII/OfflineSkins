package lain.mods.skins.impl;

public class ConfigOptions {

    public boolean useMojang;

    /**
     * @return self with all options revert to default.
     */
    public ConfigOptions defaultOptions() {
        useMojang = true;
        return this;
    }

    /**
     * @return true if changed.
     */
    public boolean validate() {
        return false;
    }

}
