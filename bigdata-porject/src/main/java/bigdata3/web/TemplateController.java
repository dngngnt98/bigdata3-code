package bigdata3.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bigdata3.domain.Menu;
import bigdata3.domain.Template;
import bigdata3.service.MenuCategoryService;
import bigdata3.service.MenuService;
import bigdata3.service.TemplateService;
import bigdata3.utils.Paging;

@Controller
@RequestMapping("template")
public class TemplateController {

  @Autowired
  TemplateService templateService;

  @Autowired
  MenuCategoryService menuCategoryService;

  @Autowired
  MenuService menuService;


  /*
   * @RequestMapping("menu") public @ResponseBody List<Menu> list(@RequestParam
   * String selectTarget, HttpServletResponse result) throws Exception{ List<Menu>
   * list = menuService.selectByType(selectTarget); System.out.println(list);
   * return list; }
   */

  @RequestMapping("list")
  public String list(@RequestParam(defaultValue = "1") int curPage, Model model) {

    int count = templateService.count();
    Paging paging = new Paging(curPage, count);

    int startIndex = paging.getStart();
    int pageSize = paging.getEnd();

    List<Template> tempList = templateService.list(startIndex, pageSize);

    model.addAttribute("tempList", tempList);
    model.addAttribute("paging", paging);
    model.addAttribute("count", count);

    return "menu/menulist";
  }

  @RequestMapping("insert")
  public String insert(Template template) {

    templateService.insert(template);

    return "redirect:../template/newtemplate";
  }
}
