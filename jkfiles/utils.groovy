{
    echo "utils begin..."
    def cfg=readProperties file:"jkfiles/cfg.properties"
    def a = cfg['name']
    echo "${a}"
    echo "utils end.."
}
