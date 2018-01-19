1.环境需要jdk1.8或以上

SpringBoot项目的Bean装配默认规则是根据Application类所在的包位置从上往下扫描！
"Application类"是指SpringBoot项目入口类。这个类的位置很关键：
	如果Application类所在的包为：com.yc.springboot,则只会扫描com.yc.springboot包及其所有子包，如果service或dao所在包不在com.yc.springboot及其子包下，则不会被扫描！
	即, 把Application类放到dao、service所在包的上级com.yc.springboot知道这一点非常关键，不知道spring文档里有没有给出说明，如果不知道还真是无从解决。