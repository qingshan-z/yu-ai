package com.yupi.yuaicodemother.ai.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.Data;

@Description("生成的多个代码文件的结果")
@Data
public class MultiFileCodeResult {

    /*
     * 生成的 HTML 代码
     */
    @Description("HTML代码")
    private String htmlCode;

    /*
     * 生成的 CSS 代码
     */
    @Description("CSS代码")
    private String cssCode;

    /*
     * 生成的 JS 代码
     */
    @Description("JS代码")
    private String jsCode;

    /*
     * 代码描述
     */
    @Description("生成代码的描述")
    private String description;
}
