package com.yupi.yuaicodemother.ai.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.Data;

@Description("生成的 HTML 代码文件的结果")
@Data
public class HtmlCodeResult {

    /*
     * 生成的 HTML 代码
     */
    @Description("HTML代码")
    private String htmlCode;

    /*
     * 代码描述
     */
    @Description("生成代码的描述")
    private String description;
}
