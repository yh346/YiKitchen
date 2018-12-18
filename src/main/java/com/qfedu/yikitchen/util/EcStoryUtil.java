package com.qfedu.yikitchen.util;


import com.qfedu.yikitchen.pojo.Discuss;
import com.qfedu.yikitchen.pojo.Like;
import com.qfedu.yikitchen.pojo.Look;
import com.qfedu.yikitchen.pojo.Story;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author:阿桑
 * Date:2018/12/10/010
 * Description: 内部使用严禁外泄
 */
@Component
public class EcStoryUtil {

    public List<Story> getStory(List<Story> storyList, List<Discuss> list, List<Look> looks, List<Like> likes) {

        //判断故事是否为空
        if (storyList.get(0) != null) {

            //循环遍历故事
            for (int i = 0; i < storyList.size(); i++) {

                int storyId = storyList.get(i).getId();

                //判断评论是否为空
               /* if (list.get(0) != null) {
                    //根据故事id循环插入评论数量
                    for (int j = 0; j <list.size(); j++) {

                        int storyIds = list.get(j).getStoryid();

                        if (storyId == storyIds) {

                            lists.get(i).setPlayernum(list.get(j).
                            break;
                        }
                    }

                }
*/

                //判断点赞是否为空
                if (likes.get(0) != null) {
                    //根据故事id循环插入点赞数量
                    for (int m = 0; m < likes.size(); m++) {
                        int vStoryId = likes.get(m).getStoryid();

                        if (storyId == vStoryId) {
                            storyList.get(i).setLikenum(likes.get(m).getLikenum());
                            break;
                        }
                    }

                }


                //判断观看是否为空
                if (looks.get(0) != null) {
                    //根据故事id循环插入观看数量
                    for (int n = 0; n < looks.size(); n++) {

                        int sStoryId = looks.get(n).getStoryid();

                        if (storyId == sStoryId) {
                            storyList.get(i).setLooknum(looks.get(n).getLooknum());
                            break;
                        }
                    }

                }
            }

        }

        return storyList;
    }
}
