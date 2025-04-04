package com.qacart.tasky.config;

import com.qacart.tasky.converter.ConvertStringToEnumType;
import com.qacart.tasky.enums.BrowserType;
import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:env",
        "system:properties",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {


    @ConverterClass(ConvertStringToEnumType.class)
    @DefaultValue("CHROME")
    BrowserType browser();
}
