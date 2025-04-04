package com.qacart.tasky.config;

import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:env",
        "system:properties",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

}
