# SimpleItemDecoration

#### 示例图片
![image-1](https://github.com/WangFion/SimpleItemDecoration/blob/master/image/device-1.png)
![image-2](https://github.com/WangFion/SimpleItemDecoration/blob/master/image/device-2.png)
![image-3](https://github.com/WangFion/SimpleItemDecoration/blob/master/image/device-3.png)
![image-4](https://github.com/WangFion/SimpleItemDecoration/blob/master/image/device-4.png)

#### 初始化
```
    /**
     * 线性布局
     * @param color 间隔线颜色
     * @param span 间隔线宽度
     */
    public SimpleItemDecoration(int color, int span){
        mHorizontalDivider = new ColorDrawable(color);
        mVerticalDivider = new ColorDrawable(color);
        mHorizontalSpan = span;
        mVerticalSpan = span;
    }

    /**
     * 网格布局
     * @param hColor 横向间隔线颜色
     * @param vColor 纵向间隔线颜色
     * @param hSpan  横向间隔线宽度
     * @param vSpan  纵向间隔线宽度
     */
    public SimpleItemDecoration(int hColor, int vColor, int hSpan, int vSpan){
        mHorizontalDivider = new ColorDrawable(hColor);
        mVerticalDivider = new ColorDrawable(vColor);
        mHorizontalSpan = hSpan;
        mVerticalSpan = vSpan;
    }
```
