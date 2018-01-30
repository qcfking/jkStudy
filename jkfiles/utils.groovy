def getCfg(id) {
    def cfg=readProperties file:"jkfiles/cfg.properties"
    cfg;
}
this
